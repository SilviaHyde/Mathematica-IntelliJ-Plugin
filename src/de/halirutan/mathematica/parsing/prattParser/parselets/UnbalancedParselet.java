/*
 * Mathematica Plugin for Jetbrains IDEA
 * Copyright (C) 2013 Patrick Scheibe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.halirutan.mathematica.parsing.prattParser.parselets;

import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;
import de.halirutan.mathematica.parsing.MathematicaElementTypes;
import de.halirutan.mathematica.parsing.prattParser.MathematicaParser;

/**
 * @author patrick (3/30/13)
 */
public class UnbalancedParselet implements PrefixParselet {
    final int precedence;

    public UnbalancedParselet(int precedence) {
        this.precedence = precedence;
    }

    @Override
    public MathematicaParser.Result parse(MathematicaParser parser) {
        final IElementType token = parser.getTokenType();
        String braceChar = "delimiter";
        if (token == MathematicaElementTypes.RIGHT_BRACE) {
            braceChar = "'}'";
        } else if (token == MathematicaElementTypes.RIGHT_BRACKET) {
            braceChar = "']'";
        } else if (token == MathematicaElementTypes.RIGHT_PAR) {
            braceChar = "')'";
        }
        final PsiBuilder.Marker unbalancedMark = parser.getBuilder().mark();
        parser.advanceLexer();
        unbalancedMark.error("Unbalanced " + braceChar);
        return parser.result(unbalancedMark, token, false);

    }
}