/*
Copyright 2016 Bowler Hat LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.nextgenactionscript.vscode.debug.events;

import com.nextgenactionscript.vscode.debug.protocol.Event;

public class ThreadEvent extends Event<ThreadEvent.ThreadBody>
{
    public static String EVENT_TYPE = "thread";

    public ThreadEvent(ThreadEvent.ThreadBody body)
    {
        super(EVENT_TYPE, body);
    }

    public class ThreadBody extends Event.EventBody
    {
        public String reason;
        public int threadID;
    }
}