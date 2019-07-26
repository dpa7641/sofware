import React from "react";
import PropTypes from "prop-types";
import './Sidebar.css';

class MainContent extends React.Component {
  static propTypes = {
    body: PropTypes.object.isRequired
  };

  render() {
    const { body } = this.props;
    return (
      <div className="col-md-9">
        {body}
      </div>
    );
  }
}

export default MainContent;