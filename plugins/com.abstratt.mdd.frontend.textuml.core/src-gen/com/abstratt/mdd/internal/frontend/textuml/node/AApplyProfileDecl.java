/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AApplyProfileDecl extends PApplyProfileDecl
{
    private TApply _apply_;
    private PQualifiedIdentifier _qualifiedIdentifier_;
    private TSemicolon _semicolon_;

    public AApplyProfileDecl()
    {
        // Constructor
    }

    public AApplyProfileDecl(
        @SuppressWarnings("hiding") TApply _apply_,
        @SuppressWarnings("hiding") PQualifiedIdentifier _qualifiedIdentifier_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setApply(_apply_);

        setQualifiedIdentifier(_qualifiedIdentifier_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AApplyProfileDecl(
            cloneNode(this._apply_),
            cloneNode(this._qualifiedIdentifier_),
            cloneNode(this._semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAApplyProfileDecl(this);
    }

    public TApply getApply()
    {
        return this._apply_;
    }

    public void setApply(TApply node)
    {
        if(this._apply_ != null)
        {
            this._apply_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._apply_ = node;
    }

    public PQualifiedIdentifier getQualifiedIdentifier()
    {
        return this._qualifiedIdentifier_;
    }

    public void setQualifiedIdentifier(PQualifiedIdentifier node)
    {
        if(this._qualifiedIdentifier_ != null)
        {
            this._qualifiedIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._qualifiedIdentifier_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._apply_)
            + toString(this._qualifiedIdentifier_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._apply_ == child)
        {
            this._apply_ = null;
            return;
        }

        if(this._qualifiedIdentifier_ == child)
        {
            this._qualifiedIdentifier_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._apply_ == oldChild)
        {
            setApply((TApply) newChild);
            return;
        }

        if(this._qualifiedIdentifier_ == oldChild)
        {
            setQualifiedIdentifier((PQualifiedIdentifier) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
