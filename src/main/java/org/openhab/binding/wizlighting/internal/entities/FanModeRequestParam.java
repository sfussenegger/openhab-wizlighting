/**
 * Copyright (c) 2010-2024 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.wizlighting.internal.entities;

import org.eclipse.jdt.annotation.NonNullByDefault;

import com.google.gson.annotations.Expose;

/**
 * This POJO represents one Fan Mode Request Param
 *
 * The outgoing JSON should look like this:
 *
 * {"id": 22, "method": "setPilot", "params": {"fanMode": 2}}
 *
 * @see org.openhab.binding.wizlighting.internal.enums.WizLightingFanMode
 */
@NonNullByDefault
public class FanModeRequestParam extends StateRequestParam {
    @Expose(serialize = true, deserialize = true)
    private int fanMode;

    public FanModeRequestParam(int sceneId) {
        super(true);
        this.fanMode = sceneId;
    }

    public int getFanMode() {
        return fanMode;
    }

    public void setFanMode(int fanMode) {
        this.fanMode = fanMode;
    }
}
