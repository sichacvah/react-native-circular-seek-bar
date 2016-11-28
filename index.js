import { PropTypes } from 'react';
import { requireNativeComponent, View, ColorPropType } from 'react-native';

var iface = {
  name: 'CircularSeekBarView',
  propTypes: {
    circleColor: ColorPropType,
    circleProgressColor: ColorPropType,
    progress: PropTypes.number,
    strokeWidth: PropTypes.number,
    circleXRadius: PropTypes.number,
    circleYRadius: PropTypes.number,
    endAngle: PropTypes.number,
    startAngle: PropTypes.number,
    max: PropTypes.number,
    pointerAlphaOnTouch: PropTypes.number,
    pointerColor: ColorPropType,
    pointerHaloColor: ColorPropType,
    useCustomRadius: PropTypes.bool,
    ...View.propTypes // include the default view properties
  }
}

module.exports = requireNativeComponent('CircularSeekBarView', iface);