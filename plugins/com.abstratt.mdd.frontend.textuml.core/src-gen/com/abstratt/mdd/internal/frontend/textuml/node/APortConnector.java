/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class APortConnector extends PPortConnector
{
    private TConnector _connector_;
    private PConnectorEndList _connectorEndList_;

    public APortConnector()
    {
        // Constructor
    }

    public APortConnector(
        @SuppressWarnings("hiding") TConnector _connector_,
        @SuppressWarnings("hiding") PConnectorEndList _connectorEndList_)
    {
        // Constructor
        setConnector(_connector_);

        setConnectorEndList(_connectorEndList_);

    }

    @Override
    public Object clone()
    {
        return new APortConnector(
            cloneNode(this._connector_),
            cloneNode(this._connectorEndList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPortConnector(this);
    }

    public TConnector getConnector()
    {
        return this._connector_;
    }

    public void setConnector(TConnector node)
    {
        if(this._connector_ != null)
        {
            this._connector_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._connector_ = node;
    }

    public PConnectorEndList getConnectorEndList()
    {
        return this._connectorEndList_;
    }

    public void setConnectorEndList(PConnectorEndList node)
    {
        if(this._connectorEndList_ != null)
        {
            this._connectorEndList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._connectorEndList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._connector_)
            + toString(this._connectorEndList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._connector_ == child)
        {
            this._connector_ = null;
            return;
        }

        if(this._connectorEndList_ == child)
        {
            this._connectorEndList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._connector_ == oldChild)
        {
            setConnector((TConnector) newChild);
            return;
        }

        if(this._connectorEndList_ == oldChild)
        {
            setConnectorEndList((PConnectorEndList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
