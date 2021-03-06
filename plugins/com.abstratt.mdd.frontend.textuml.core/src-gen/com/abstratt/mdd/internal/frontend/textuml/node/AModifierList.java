/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AModifierList extends PModifierList
{
    private PModifier _modifier_;
    private PModifierList _modifierList_;

    public AModifierList()
    {
        // Constructor
    }

    public AModifierList(
        @SuppressWarnings("hiding") PModifier _modifier_,
        @SuppressWarnings("hiding") PModifierList _modifierList_)
    {
        // Constructor
        setModifier(_modifier_);

        setModifierList(_modifierList_);

    }

    @Override
    public Object clone()
    {
        return new AModifierList(
            cloneNode(this._modifier_),
            cloneNode(this._modifierList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAModifierList(this);
    }

    public PModifier getModifier()
    {
        return this._modifier_;
    }

    public void setModifier(PModifier node)
    {
        if(this._modifier_ != null)
        {
            this._modifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._modifier_ = node;
    }

    public PModifierList getModifierList()
    {
        return this._modifierList_;
    }

    public void setModifierList(PModifierList node)
    {
        if(this._modifierList_ != null)
        {
            this._modifierList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._modifierList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._modifier_)
            + toString(this._modifierList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._modifier_ == child)
        {
            this._modifier_ = null;
            return;
        }

        if(this._modifierList_ == child)
        {
            this._modifierList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._modifier_ == oldChild)
        {
            setModifier((PModifier) newChild);
            return;
        }

        if(this._modifierList_ == oldChild)
        {
            setModifierList((PModifierList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
