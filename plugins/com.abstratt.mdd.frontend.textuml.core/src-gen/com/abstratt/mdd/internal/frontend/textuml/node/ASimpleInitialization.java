/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleInitialization extends PSimpleInitialization
{
    private TAssignop _assignop_;
    private PLiteralOrIdentifier _literalOrIdentifier_;

    public ASimpleInitialization()
    {
        // Constructor
    }

    public ASimpleInitialization(
        @SuppressWarnings("hiding") TAssignop _assignop_,
        @SuppressWarnings("hiding") PLiteralOrIdentifier _literalOrIdentifier_)
    {
        // Constructor
        setAssignop(_assignop_);

        setLiteralOrIdentifier(_literalOrIdentifier_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleInitialization(
            cloneNode(this._assignop_),
            cloneNode(this._literalOrIdentifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleInitialization(this);
    }

    public TAssignop getAssignop()
    {
        return this._assignop_;
    }

    public void setAssignop(TAssignop node)
    {
        if(this._assignop_ != null)
        {
            this._assignop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assignop_ = node;
    }

    public PLiteralOrIdentifier getLiteralOrIdentifier()
    {
        return this._literalOrIdentifier_;
    }

    public void setLiteralOrIdentifier(PLiteralOrIdentifier node)
    {
        if(this._literalOrIdentifier_ != null)
        {
            this._literalOrIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._literalOrIdentifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._assignop_)
            + toString(this._literalOrIdentifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._assignop_ == child)
        {
            this._assignop_ = null;
            return;
        }

        if(this._literalOrIdentifier_ == child)
        {
            this._literalOrIdentifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._assignop_ == oldChild)
        {
            setAssignop((TAssignop) newChild);
            return;
        }

        if(this._literalOrIdentifier_ == oldChild)
        {
            setLiteralOrIdentifier((PLiteralOrIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
