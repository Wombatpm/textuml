/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ACallTransitionTrigger extends PTransitionTrigger
{
    private TCall _call_;
    private TLParen _lParen_;
    private TIdentifier _identifier_;
    private TRParen _rParen_;

    public ACallTransitionTrigger()
    {
        // Constructor
    }

    public ACallTransitionTrigger(
        @SuppressWarnings("hiding") TCall _call_,
        @SuppressWarnings("hiding") TLParen _lParen_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") TRParen _rParen_)
    {
        // Constructor
        setCall(_call_);

        setLParen(_lParen_);

        setIdentifier(_identifier_);

        setRParen(_rParen_);

    }

    @Override
    public Object clone()
    {
        return new ACallTransitionTrigger(
            cloneNode(this._call_),
            cloneNode(this._lParen_),
            cloneNode(this._identifier_),
            cloneNode(this._rParen_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACallTransitionTrigger(this);
    }

    public TCall getCall()
    {
        return this._call_;
    }

    public void setCall(TCall node)
    {
        if(this._call_ != null)
        {
            this._call_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._call_ = node;
    }

    public TLParen getLParen()
    {
        return this._lParen_;
    }

    public void setLParen(TLParen node)
    {
        if(this._lParen_ != null)
        {
            this._lParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lParen_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public TRParen getRParen()
    {
        return this._rParen_;
    }

    public void setRParen(TRParen node)
    {
        if(this._rParen_ != null)
        {
            this._rParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rParen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._call_)
            + toString(this._lParen_)
            + toString(this._identifier_)
            + toString(this._rParen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._call_ == child)
        {
            this._call_ = null;
            return;
        }

        if(this._lParen_ == child)
        {
            this._lParen_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._rParen_ == child)
        {
            this._rParen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._call_ == oldChild)
        {
            setCall((TCall) newChild);
            return;
        }

        if(this._lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
