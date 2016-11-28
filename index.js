import { PropTypes, Component } from 'react';
import { requireNativeComponent, View, ColorPropType } from 'react-native';

class CircularSeekBarView extends Component {
  constructor(props) {
    super(props)
    this._onChange = this._onChange.bind(this)
  }

  _onChange(event) {
    if (typeof this.props.onChangeProgress === 'function' && event.nativeEvent.fromUser) {
      this.props.onChangeProgress(event.nativeEvent.value)
    }
  }

  render() {
    return <RCTCircularSeekBarView {...this.props} onChange={this._onChange} />
  }
}

CircularSeekBarView.propTypes = {
    onChangeProgress: PropTypes.func,
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
    pointerHaloColorOnTouch: ColorPropType,
    useCustomRadius: PropTypes.bool,
    ...View.propTypes, // include the default view properties
}

const RCTCircularSeekBarView = requireNativeComponent('CircularSeekBarView', CircularSeekBarView);

export default CircularSeekBarView 