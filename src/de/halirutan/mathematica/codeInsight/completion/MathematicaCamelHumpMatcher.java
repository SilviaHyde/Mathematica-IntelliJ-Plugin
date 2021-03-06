/*
 * Copyright (c) 2013 Patrick Scheibe
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package de.halirutan.mathematica.codeInsight.completion;

import com.intellij.codeInsight.completion.PrefixMatcher;
import com.intellij.codeInsight.lookup.LookupElement;
import org.jetbrains.annotations.NotNull;

/**
 * @author patrick (4/3/13)
 */
public class MathematicaCamelHumpMatcher extends PrefixMatcher {
    @Override
    public boolean prefixMatches(@NotNull String name) {
        return false;
    }

    @NotNull
    @Override
    public PrefixMatcher cloneWithPrefix(@NotNull String prefix) {
        return null;
    }

    protected MathematicaCamelHumpMatcher(String prefix) {
        super(prefix);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public boolean prefixMatches(@NotNull LookupElement element) {
        return super.prefixMatches(element);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public boolean isStartMatch(LookupElement element) {
        return super.isStartMatch(element);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public boolean isStartMatch(String name) {
        return super.isStartMatch(name);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public int matchingDegree(String string) {
        return super.matchingDegree(string);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
