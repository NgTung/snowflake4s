/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */
package com.septech.snowflake4s

import com.google.inject.AbstractModule
import com.septech.snowflake4s.algorithms.TwitterSnowflake
import com.septech.snowflake4s.node.MachineMACAddress
import com.septech.snowflake4s.node.NodeMachine
import net.codingwell.scalaguice.ScalaModule

class GeneratorModule extends AbstractModule with ScalaModule {

  override def configure() = {
    bind[NodeMachine].to[MachineMACAddress]
    bind[Generator].to[TwitterSnowflake]
  }

}