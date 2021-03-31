/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
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
package org.spongepowered.api.event.entity.explosive;

import org.spongepowered.api.entity.explosive.fused.FusedExplosive;
import org.spongepowered.api.event.Cancellable;
import org.spongepowered.api.event.Event;

/**
 * Event called when a primed {@link FusedExplosive} is defused.
 */
public interface DefuseExplosiveEvent extends Event {

    /**
     * Gets the {@link FusedExplosive}.
     *
     * @return The fused explosive
     */
    FusedExplosive fusedExplosive();

    /**
     * Event called immediately before a primed {@link FusedExplosive} is
     * defused.
     */
    interface Pre extends DefuseExplosiveEvent, Cancellable {}

    /**
     * Event called after a primed {@link FusedExplosive} has been defused.
     */
    interface Post extends DefuseExplosiveEvent {}

}
