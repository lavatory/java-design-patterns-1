/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Gareth Jon Lynch
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.gazbert.patterns.structural.decorator;

import java.math.BigDecimal;

/**
 * Concrete Decorator implementation for adding extra state for a UK ISA (government backed tax-free savings) account.
 * <p>
 * The broker fee is less to encourage the public to invest more...
 *
 * @author gazbert
 */
public class IsaAccount extends AccountDecorator {

    private static BigDecimal BROKER_FEE = new BigDecimal("0.1");

    /**
     * Constructor creates this Concrete Decorator.
     *
     * @param wrappedComponent the Account Component we are wrapping/decorating.
     */
    public IsaAccount(Account wrappedComponent) {
        super(wrappedComponent);
    }

    @Override
    protected BigDecimal getBrokerFee() {
        return BROKER_FEE;
    }
}
