package com.abstratt.graphviz.uml.ui;

import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.OMIT_CONSTRAINTS_FOR_NAVIGABILITY;
import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.SHOW_ASSOCIATION_END_MULTIPLICITY;
import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.SHOW_ASSOCIATION_END_NAME;
import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.SHOW_ASSOCIATION_END_OWNERSHIP;
import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.SHOW_ASSOCIATION_NAME;
import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.SHOW_CLASSIFIER_COMPARTMENT;
import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.SHOW_CLASSIFIER_COMPARTMENT_FOR_PACKAGE;
import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.SHOW_ELEMENTS_IN_OTHER_PACKAGES;
import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.SHOW_PARAMETER_DIRECTION;
import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.SHOW_PRIMITIVES;
import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.SHOW_STRUCTURAL_FEATURE_VISIBILITY;

import java.util.Arrays;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import com.abstratt.graphviz.uml.UML;
import com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.ShowClassifierCompartmentForPackageOptions;
import com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.ShowClassifierCompartmentOptions;
import com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.ShowCrossPackageElementOptions;

public class UMLPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {
	
	private Button showAssociationEndOwnershipCheckBox;
	private Button showStructuralFeatureVisibilityCheckBox;
	private Button showAssociationEndMultiplicityCheckBox;
	private Button showAssociationEndNameCheckBox;
	private Button showAssociationNameCheckBox;
	private Button showPrimitivesCheckBox;
	private Button omitConstraintsForNavigabilityCheckBox;
	private Button showParameterDirectionCheckBox;
	private Combo showClassifierCompartmentsCombo;
	private Combo showClassifierCompartmentsForPackageCombo;
	private Combo showElementsInOtherPackagesCombo;
	private ScopedPreferenceStore preferenceStore;

	public UMLPreferencePage() {
	}

	public UMLPreferencePage(String title) {
		super(title);
	}

	public UMLPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
	}
	
	private Button makeCheck(Composite parent, String label) {
		Button newCheck = new Button(parent, SWT.CHECK);
		newCheck.setText(label);
		return newCheck;
	}
	
	private Combo makeCombo(Composite parent, String labelText, java.util.List<?> options) {
		Composite group = new Composite(parent, SWT.NONE);
		group.setLayout(new RowLayout(SWT.HORIZONTAL));
		Label label = new Label(group, SWT.NONE);
		label.setText(labelText + ": ");
		Combo combo = new Combo(group, SWT.READ_ONLY);
		String[] items = new String[options.size()];
		for (int i = 0; i < items.length; i++) {
			items[i] = options.get(i).toString();
		}
		combo.setItems(items);
		return combo;
	}


	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));

		showPrimitivesCheckBox = makeCheck(composite, "Show primitives");
		showAssociationNameCheckBox = makeCheck(composite, "Show name");
		showAssociationEndNameCheckBox = makeCheck(composite, "Show end name");
		showAssociationEndOwnershipCheckBox = makeCheck(composite, "Show end ownership (\"dots\")");
		showAssociationEndMultiplicityCheckBox = makeCheck(composite, "Show end multiplicity");
		omitConstraintsForNavigabilityCheckBox = makeCheck(composite, "Omit constraints for association navigability (rank(source) > rank (target)) ");
		showStructuralFeatureVisibilityCheckBox = makeCheck(composite, "Show visibility in structural features");
		showParameterDirectionCheckBox = makeCheck(composite, "Show parameter direction for operations");
		showElementsInOtherPackagesCombo = makeCombo(composite, "Show elements across packages", Arrays.asList(ShowCrossPackageElementOptions.values()));
		showClassifierCompartmentsCombo = makeCombo(composite, "Show compartments in classifiers", Arrays.asList(ShowClassifierCompartmentOptions.values()));
		showClassifierCompartmentsForPackageCombo = makeCombo(composite, "Show compartments in classifiers for package", Arrays.asList(ShowClassifierCompartmentForPackageOptions.values()));
		
		loadPreferences();

		return composite;
	}

	@Override
	public IPreferenceStore getPreferenceStore() {
		if (preferenceStore == null) {
			preferenceStore = new ScopedPreferenceStore(new InstanceScope(),
					UML.PLUGIN_ID);
		}
		return preferenceStore;
	}

	private void loadPreferences() {
		IPreferenceStore preferenceStore = getPreferenceStore();
		showPrimitivesCheckBox.setSelection(preferenceStore.getBoolean(
				SHOW_PRIMITIVES));
		showStructuralFeatureVisibilityCheckBox.setSelection(preferenceStore.getBoolean(
				SHOW_STRUCTURAL_FEATURE_VISIBILITY));
		showAssociationEndMultiplicityCheckBox.setSelection(preferenceStore.getBoolean(
				SHOW_ASSOCIATION_END_MULTIPLICITY));
		showAssociationEndOwnershipCheckBox.setSelection(preferenceStore.getBoolean(
				SHOW_ASSOCIATION_END_OWNERSHIP));
		showAssociationNameCheckBox.setSelection(preferenceStore.getBoolean(
				SHOW_ASSOCIATION_NAME));
		showAssociationEndNameCheckBox.setSelection(preferenceStore.getBoolean(
				SHOW_ASSOCIATION_END_NAME));
		omitConstraintsForNavigabilityCheckBox.setSelection(preferenceStore.getBoolean(
				OMIT_CONSTRAINTS_FOR_NAVIGABILITY));
		showParameterDirectionCheckBox.setSelection(preferenceStore.getBoolean(
				SHOW_PARAMETER_DIRECTION));
		select(showElementsInOtherPackagesCombo, preferenceStore.getString(SHOW_ELEMENTS_IN_OTHER_PACKAGES));
		select(showClassifierCompartmentsCombo, preferenceStore.getString(SHOW_CLASSIFIER_COMPARTMENT));
		select(showClassifierCompartmentsForPackageCombo, preferenceStore.getString(SHOW_CLASSIFIER_COMPARTMENT_FOR_PACKAGE));
	}
	
	private void select(Combo toSelect, String option) {
		if (option == null)
			toSelect.select(0);
		else
			toSelect.setText(option);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	@Override
	public boolean performOk() {
		IPreferenceStore preferenceStore = getPreferenceStore();
		preferenceStore.setValue(SHOW_ASSOCIATION_END_OWNERSHIP,
				showAssociationEndOwnershipCheckBox.getSelection());
		preferenceStore.setValue(SHOW_ASSOCIATION_END_MULTIPLICITY,
				showAssociationEndMultiplicityCheckBox.getSelection());
		preferenceStore.setValue(SHOW_ASSOCIATION_END_NAME,
				showAssociationEndNameCheckBox.getSelection());
		preferenceStore.setValue(SHOW_ASSOCIATION_NAME, showAssociationNameCheckBox
				.getSelection());
		preferenceStore.setValue(SHOW_PRIMITIVES, showPrimitivesCheckBox
				.getSelection());
		preferenceStore.setValue(SHOW_STRUCTURAL_FEATURE_VISIBILITY,
				showStructuralFeatureVisibilityCheckBox.getSelection());
		preferenceStore.setValue(OMIT_CONSTRAINTS_FOR_NAVIGABILITY,
				omitConstraintsForNavigabilityCheckBox.getSelection());
		preferenceStore.setValue(SHOW_PARAMETER_DIRECTION,
				showParameterDirectionCheckBox.getSelection());
		preferenceStore.setValue(SHOW_CLASSIFIER_COMPARTMENT,
				showClassifierCompartmentsCombo.getItem(showClassifierCompartmentsCombo.getSelectionIndex()));
		preferenceStore.setValue(SHOW_CLASSIFIER_COMPARTMENT_FOR_PACKAGE,
				showClassifierCompartmentsForPackageCombo.getItem(showClassifierCompartmentsForPackageCombo.getSelectionIndex()));
		preferenceStore.setValue(SHOW_ELEMENTS_IN_OTHER_PACKAGES,
				showElementsInOtherPackagesCombo.getItem(showElementsInOtherPackagesCombo.getSelectionIndex()));
		return super.performOk();
	}

	@Override
	protected void performDefaults() {
		IPreferenceStore preferenceStore = getPreferenceStore();
		preferenceStore.setToDefault(SHOW_ASSOCIATION_END_OWNERSHIP);
		preferenceStore.setToDefault(SHOW_ASSOCIATION_END_MULTIPLICITY);
		preferenceStore.setToDefault(SHOW_ASSOCIATION_END_NAME);
		preferenceStore.setToDefault(SHOW_ASSOCIATION_NAME);
		preferenceStore.setToDefault(SHOW_STRUCTURAL_FEATURE_VISIBILITY);
		preferenceStore.setToDefault(OMIT_CONSTRAINTS_FOR_NAVIGABILITY);
		preferenceStore.setToDefault(SHOW_PARAMETER_DIRECTION);
		preferenceStore.setToDefault(SHOW_CLASSIFIER_COMPARTMENT);
		preferenceStore.setToDefault(SHOW_CLASSIFIER_COMPARTMENT_FOR_PACKAGE);
		preferenceStore.setToDefault(SHOW_ELEMENTS_IN_OTHER_PACKAGES);
		super.performDefaults();
		loadPreferences();
	}
}
