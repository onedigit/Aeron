/*
 * Copyright 2014 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.aeron.driver;

import uk.co.real_logic.agrona.concurrent.UnsafeBuffer;
import uk.co.real_logic.aeron.common.protocol.StatusMessageFlyweight;

import java.net.InetSocketAddress;

@FunctionalInterface
public interface StatusMessageFrameHandler
{
    /**
     * Handle a Status Message Frame
     *
     * @param header of the first Status Message Frame in the message (may be re-wrapped if needed)
     * @param buffer holding the NAK (always starts at 0 offset)
     * @param length of the Frame (may be longer than the header frame length)
     * @param srcAddress of the Frame
     */
    void onFrame(StatusMessageFlyweight header, UnsafeBuffer buffer, int length, InetSocketAddress srcAddress);
}
