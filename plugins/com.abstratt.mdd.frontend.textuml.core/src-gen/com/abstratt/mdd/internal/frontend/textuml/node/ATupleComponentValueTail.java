/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ATupleComponentValueTail extends PTupleComponentValueTail
{
    private TComma _comma_;
    private PTupleComponentValue _tupleComponentValue_;

    public ATupleComponentValueTail()
    {
        // Constructor
    }

    public ATupleComponentValueTail(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PTupleComponentValue _tupleComponentValue_)
    {
        // Constructor
        setComma(_comma_);

        setTupleComponentValue(_tupleComponentValue_);

    }

    @Override
    public Object clone()
    {
        return new ATupleComponentValueTail(
            cloneNode(this._comma_),
            cloneNode(this._tupleComponentValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATupleComponentValueTail(this);
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

    public PTupleComponentValue getTupleComponentValue()
    {
        return this._tupleComponentValue_;
    }

    public void setTupleComponentValue(PTupleComponentValue node)
    {
        if(this._tupleComponentValue_ != null)
        {
            this._tupleComponentValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tupleComponentValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._tupleComponentValue_);
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

        if(this._tupleComponentValue_ == child)
        {
            this._tupleComponentValue_ = null;
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

        if(this._tupleComponentValue_ == oldChild)
        {
            setTupleComponentValue((PTupleComponentValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
