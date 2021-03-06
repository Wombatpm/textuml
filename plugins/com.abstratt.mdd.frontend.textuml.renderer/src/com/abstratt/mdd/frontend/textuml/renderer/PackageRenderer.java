/*******************************************************************************
 * Copyright (c) 2006, 2008 Abstratt Technologies
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rafael Chaves (Abstratt Technologies) - initial API and implementation
 *******************************************************************************/ 
package com.abstratt.mdd.frontend.textuml.renderer;

import static com.abstratt.mdd.frontend.textuml.renderer.TextUMLRenderingUtils.name;
import static com.abstratt.mdd.frontend.textuml.renderer.TextUMLRenderingUtils.qualifiedName;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;

import com.abstratt.modelrenderer.IEObjectRenderer;
import com.abstratt.modelrenderer.IRenderingSession;
import com.abstratt.modelrenderer.IndentedPrintWriter;
/**
 * 
 */
public class PackageRenderer implements IEObjectRenderer<Package> {
	public boolean renderObject(Package package_, IndentedPrintWriter pw,
			IRenderingSession context) {
		renderPrologue(package_, pw, context);
		pw.println();

		List<ProfileApplication> profileApplications = package_
				.getProfileApplications();
		if (!profileApplications.isEmpty()) {
			context.renderAll(profileApplications);
			pw.println();
		}

		List<PackageImport> packageImports = package_.getPackageImports();
		if (!packageImports.isEmpty()) {
			context.renderAll(packageImports);
			pw.println();
		}

		List<ElementImport> elementImports = package_.getElementImports();
		if (!elementImports.isEmpty()) {
			context.renderAll(elementImports);
			pw.println();
		}

		final Collection<Classifier> subPackages = EcoreUtil.getObjectsByType(
				package_.getOwnedElements(), UMLPackage.Literals.PACKAGE);
		context.renderAll(subPackages);

		final Collection<Classifier> classifiers = EcoreUtil.getObjectsByType(
				package_.getOwnedElements(), UMLPackage.Literals.CLASSIFIER);
		context.renderAll(classifiers);

		renderEpilogue(package_, pw, context);
		return true;
	}

	public void renderPrologue(Package package_, IndentedPrintWriter pw,
			IRenderingSession context) {
		TextUMLRenderingUtils.renderStereotypeApplications(pw, package_);		
		context.renderAll(package_.getOwnedComments());
		if (package_.getOwner() != null) {
			pw.println(getPackageTypeName(package_) + " " + name(package_)
					+ ";");
			pw.enterLevel();
		} else
			pw.println(getPackageTypeName(package_) + " "
					+ qualifiedName(package_) + ";");
	}

	protected String getPackageTypeName(Package package_) {
		return package_.eClass().getName().toLowerCase();
	}

	public void renderEpilogue(Package package_, IndentedPrintWriter pw,
			@SuppressWarnings("unused") IRenderingSession context) {
		if (package_.getOwner() != null)
			pw.exitLevel();
		pw.print("end");
		if (package_.getOwner() == null)
			pw.println(".");
		else {
			pw.println(";");
			pw.println();
		}
	}
}
