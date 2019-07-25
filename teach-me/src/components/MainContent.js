import React from "react";

const users = [
  'jorge',
  'daniel',
  'rodrigo',
  'german'
];

class MainContent extends React.Component {
  constructor(props) {
    super(props);
    this.state = {users: users};
  }

  render() {
    return (
      <ul>
          {users.map(user => <li>{user}</li>)}
      </ul>
    );
  }
}

export default MainContent;