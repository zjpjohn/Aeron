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
package uk.co.real_logic.aeron.driver.cmd;

import uk.co.real_logic.aeron.driver.UdpChannel;

import java.net.InetSocketAddress;

public class CreateConnectedSubscriptionCmd
{
    private final UdpChannel udpChannel;
    private final int sessionId;
    private final int streamId;
    private final int termId;
    private final InetSocketAddress controlAddress;

    public CreateConnectedSubscriptionCmd(final UdpChannel udpChannel,
                                          final int sessionId,
                                          final int streamId,
                                          final int termId,
                                          final InetSocketAddress controlAddress)
    {
        this.udpChannel = udpChannel;
        this.sessionId = sessionId;
        this.streamId = streamId;
        this.termId = termId;
        this.controlAddress = controlAddress;
    }

    public UdpChannel udpChannel()
    {
        return udpChannel;
    }

    public int sessionId()
    {
        return sessionId;
    }

    public int streamId()
    {
        return streamId;
    }

    public int termId()
    {
        return termId;
    }

    public InetSocketAddress controlAddress()
    {
        return controlAddress;
    }
}
