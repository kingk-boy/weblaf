/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.extended.dock;

import com.alee.api.annotations.NotNull;
import com.alee.managers.style.AbstractComponentDescriptor;
import com.alee.managers.style.StyleId;

/**
 * Abstract descriptor for {@link WebDockableFrame} component.
 * Extend this class for creating custom {@link WebDockableFrame} descriptors.
 *
 * @param <C> {@link WebDockableFrame} type
 * @param <U> base {@link WDockableFrameUI} type
 * @param <P> {@link IDockableFramePainter} type
 * @author Mikle Garin
 * @see <a href="https://github.com/mgarin/weblaf/wiki/How-to-use-StyleManager">How to use StyleManager</a>
 * @see com.alee.managers.style.StyleManager
 * @see com.alee.managers.style.StyleManager#registerComponentDescriptor(com.alee.managers.style.ComponentDescriptor)
 * @see com.alee.managers.style.StyleManager#unregisterComponentDescriptor(com.alee.managers.style.ComponentDescriptor)
 */
public abstract class AbstractDockableFrameDescriptor<C extends WebDockableFrame, U extends WDockableFrameUI, P extends IDockableFramePainter>
        extends AbstractComponentDescriptor<C, U, P>
{
    /**
     * Constructs new {@link AbstractDockableFrameDescriptor}.
     *
     * @param id                  {@link WebDockableFrame} identifier
     * @param componentClass      {@link WebDockableFrame} {@link Class}
     * @param uiClassId           {@link WDockableFrameUI} {@link Class} identifier
     * @param baseUIClass         base {@link WDockableFrameUI} {@link Class} applicable to {@link WebDockableFrame}
     * @param uiClass             {@link WDockableFrameUI} {@link Class} used for {@link WebDockableFrame} by default
     * @param painterInterface    {@link IDockableFramePainter} interface {@link Class}
     * @param painterClass        {@link IDockableFramePainter} implementation {@link Class}
     * @param painterAdapterClass adapter for {@link IDockableFramePainter}
     * @param defaultStyleId      {@link WebDockableFrame} default {@link StyleId}
     */
    public AbstractDockableFrameDescriptor ( @NotNull final String id, @NotNull final Class<C> componentClass,
                                             @NotNull final String uiClassId, @NotNull final Class<U> baseUIClass,
                                             @NotNull final Class<? extends U> uiClass, @NotNull final Class<P> painterInterface,
                                             @NotNull final Class<? extends P> painterClass,
                                             @NotNull final Class<? extends P> painterAdapterClass, @NotNull final StyleId defaultStyleId )
    {
        super ( id, componentClass, uiClassId, baseUIClass, uiClass, painterInterface, painterClass, painterAdapterClass, defaultStyleId );
    }
}