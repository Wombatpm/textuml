/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AWildcardTypeTail extends PWildcardTypeTail
{
    private TComma _comma_;
    private PWildcardType _wildcardType_;
    private PWildcardTypeTail _wildcardTypeTail_;

    public AWildcardTypeTail()
    {
        // Constructor
    }

    public AWildcardTypeTail(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PWildcardType _wildcardType_,
        @SuppressWarnings("hiding") PWildcardTypeTail _wildcardTypeTail_)
    {
        // Constructor
        setComma(_comma_);

        setWildcardType(_wildcardType_);

        setWildcardTypeTail(_wildcardTypeTail_);

    }

    @Override
    public Object clone()
    {
        return new AWildcardTypeTail(
            cloneNode(this._comma_),
            cloneNode(this._wildcardType_),
            cloneNode(this._wildcardTypeTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWildcardTypeTail(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PWildcardType getWildcardType()
    {
        return this._wildcardType_;
    }

    public void setWildcardType(PWildcardType node)
    {
        if(this._wildcardType_ != null)
        {
            this._wildcardType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._wildcardType_ = node;
    }

    public PWildcardTypeTail getWildcardTypeTail()
    {
        return this._wildcardTypeTail_;
    }

    public void setWildcardTypeTail(PWildcardTypeTail node)
    {
        if(this._wildcardTypeTail_ != null)
        {
            this._wildcardTypeTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._wildcardTypeTail_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._wildcardType_)
            + toString(this._wildcardTypeTail_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._wildcardType_ == child)
        {
            this._wildcardType_ = null;
            return;
        }

        if(this._wildcardTypeTail_ == child)
        {
            this._wildcardTypeTail_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._wildcardType_ == oldChild)
        {
            setWildcardType((PWildcardType) newChild);
            return;
        }

        if(this._wildcardTypeTail_ == oldChild)
        {
            setWildcardTypeTail((PWildcardTypeTail) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
