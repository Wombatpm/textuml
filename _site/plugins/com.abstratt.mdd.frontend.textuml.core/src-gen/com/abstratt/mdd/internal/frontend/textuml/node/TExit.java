/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TExit extends Token
{
    public TExit()
    {
        super.setText("exit");
    }

    public TExit(int line, int pos)
    {
        super.setText("exit");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TExit(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTExit(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TExit text.");
    }
}