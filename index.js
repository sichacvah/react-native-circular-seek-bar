import { PropTypes } from 'react';
import { requireNativeComponent, View, ColorPropType } from 'react-native';

var iface = {
  name: 'CircularSeekBarView',
  propTypes: {
    circleColor: ColorPropType,
    circleProgressColor: ColorPropType,
    progress: PropTypes.int,
    storkeWidth: PropTypes.float,
    circleXRadius: PropTypes.float,
    circleYRadius: PropTypes.float,
    endAngle: PropTypes.float,
    startAngle: PropTypes.float,
    max: PropTypes.int,
    pointerAlphaOnTouch: PropTypes.int,
    pointerColor: ColorPropType,
    reactHaloColor: ColorPropType,
    useCustomRadius: PropTypes.bool,
    ...View.propTypes // include the default view properties
  }
}

module.exports = requireNativeComponent('CircularSeekBarView', iface);