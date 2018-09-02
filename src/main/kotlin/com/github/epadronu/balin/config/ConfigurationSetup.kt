/******************************************************************************
 * Copyright 2016 Edinson E. Padrón Urdaneta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *****************************************************************************/

/* ***************************************************************************/
package com.github.epadronu.balin.config
/* ***************************************************************************/

/* ***************************************************************************/
import com.github.epadronu.balin.core.SLEEP_TIME_IN_MILLISECONDS
import com.github.epadronu.balin.core.TIME_OUT_TIME_IN_SECONDS
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
/* ***************************************************************************/

/* ***************************************************************************/
interface ConfigurationSetup {

    val autoQuit: Boolean

    val driverFactory: () -> WebDriver

    val waitForSleepTimeInMilliseconds: Long

    val waitForTimeOutTimeInSeconds: Long

    companion object {
        internal val Default = Configuration(
            true, ::FirefoxDriver, SLEEP_TIME_IN_MILLISECONDS, TIME_OUT_TIME_IN_SECONDS)
    }
}
/* ***************************************************************************/
