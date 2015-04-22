/**
 * Copyright (C) 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dashbuilder.displayer;

/**
 * A displayer settings builder for column charts
 *
 * <pre>
 *   DisplayerSettingsFactory.newColumnChartSettings()
 *   .title("By Product")
 *   .column("Product")
 *   .column("Total amount")
 *   .buildSettings()
 * </pre>
 */
public interface ColumnChartSettingsBuilder<T extends ColumnChartSettingsBuilder> extends XAxisChartSettingsBuilder<T> {

    /**
     * @param b True if the columns of this column chart are to be shown in 3D, false if they are to be shown flat.
     * @return The DisplayerSettingsBuilder instance that is being used to configure a Column chart data displayer.
     */
    T set3d(boolean b);

}