/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TNavigable extends Token
{
    public TNavigable()
    {
        super.setText("navigable");
    }

    public TNavigable(int line, int pos)
    {
        super.setText("navigable");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNavigable(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNavigable(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNavigable text.");
    }
}