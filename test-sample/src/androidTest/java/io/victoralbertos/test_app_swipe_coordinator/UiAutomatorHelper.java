/*
 * Copyright 2016 Victor Albertos
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
 */

package io.victoralbertos.test_app_swipe_coordinator;

import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;

final class UiAutomatorHelper {

  static void rotateDevice() {
    UiDevice uiDevice = UiDevice
        .getInstance(InstrumentationRegistry.getInstrumentation());
    try {
      uiDevice.setOrientationLeft();
      waitTime();
      uiDevice.setOrientationNatural();
      waitTime();
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }

  private static void waitTime() {
    try {Thread.sleep(1000);}
    catch (InterruptedException e) { e.printStackTrace();}
  }

}

