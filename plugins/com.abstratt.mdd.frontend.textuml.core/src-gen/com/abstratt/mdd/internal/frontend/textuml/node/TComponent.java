/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TComponent extends Token
{
    public TComponent()
    {
        super.setText("component");
    }

    public TComponent(int line, int pos)
    {
        super.setText("component");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComponent(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComponent(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComponent text.");
    }
}
