/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TModel extends Token
{
    public TModel()
    {
        super.setText("model");
    }

    public TModel(int line, int pos)
    {
        super.setText("model");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TModel(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTModel(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TModel text.");
    }
}
