using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNBcgTimer
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNBcgTimerModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNBcgTimerModule"/>.
        /// </summary>
        internal RNBcgTimerModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNBcgTimer";
            }
        }
    }
}
