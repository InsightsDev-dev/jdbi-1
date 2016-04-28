/*
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
package org.jdbi.v3.jodatime;

import com.google.auto.service.AutoService;

import org.jdbi.v3.DBI;
import org.jdbi.v3.spi.JdbiPlugin;

@AutoService(JdbiPlugin.class)
public class JodaTimePlugin implements JdbiPlugin {
    @Override
    public void customizeDbi(DBI dbi) {
        dbi.registerArgumentFactory(new DateTimeArgument.Factory());
        dbi.registerColumnMapper(new DateTimeMapper());
    }
}
