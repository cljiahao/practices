import React from 'react'
import ReactDOM from 'react-dom'

class App extends React.Component {
    constructor(props) {
      super(props);
     this.state = {
        detail: '',
        audio: ''
      };
      this.handleKey = this.handleKey.bind(this);
      this.handleKeyPress = this.handleKeyPress.bind(this)
      this.handleClick = this.handleClick.bind(this);
      this.playsound = this.playsound.bind(this);
    }
    
    componentDidMount() {
      document.addEventListener("keydown", this.handleKeyPress)
      document.addEventListener("click", this.handleClick)
    }
    componentWillUnmount() {
      document.removeEventListener("keydown", this.handleKeyPress)
    }
    
    playsound(id) {
      const sound = document.getElementById(id).getElementsByClassName("clip")[0]
      sound.play()
    }
  
    handleKey(i) {
      this.setState((state) => ({
        detail: i
      }));
    }
    
    handleClick(event) {
      switch(event.path[0].id) {
        case "Q":
          this.handleKey("Queen");
          this.playsound(event.path[0].id)
          break;
        case "W":
          this.handleKey("Warner");
          this.playsound(event.path[0].id)
          break;
        case "E":
          this.handleKey("Evan");
          this.playsound(event.path[0].id)
          break;
        case "A":
          this.handleKey("ACDC");
          this.playsound(event.path[0].id)
          break;
        case "S":
          this.handleKey("Skrillex");
          this.playsound(event.path[0].id)
          break;
        case "D":
          this.handleKey("Deadman");
          this.playsound(event.path[0].id)
          break;
        case "Z":
          this.handleKey("Zeppelin");
          this.playsound(event.path[0].id)
          break;
        case "X":
          this.handleKey("Xhere");
          this.playsound(event.path[0].id)
          break;
        case "C":
          this.handleKey("Cab");
          this.playsound(event.path[0].id)
          break;      
      }
    }
    
    handleKeyPress(event) {
      switch(event.keyCode) {
        case 81:
          this.handleKey("Queen");
          this.playsound("Q")
          break;
        case 87:
          this.handleKey("Warner");
          this.playsound("W")
          break;
        case 69:
          this.handleKey("Evan");
          this.playsound("E")
          break;
        case 65:
          this.handleKey("ACDC");
          this.playsound("A")
          break;
        case 83:
          this.handleKey("Skrillex");
          this.playsound("S")
          break;
        case 68:
          this.handleKey("Deadman");
          this.playsound("D")
          break;
        case 90:
          this.handleKey("Zeppelin");
          this.playsound("Z")
          break;
        case 88:
          this.handleKey("Xhere");
          this.playsound("X")
          break;
        case 67:
          this.handleKey("Cab");
          this.playsound("C")
          break;
      }
    }
     
    render() {
     return (
          <div id="drum-machine">
            <div id="display">{this.state.detail}</div>
            <div className="drum-container">
            <div className="drum-pad" id="Q"><audio className="clip" src="https://s3.amazonaws.com/freecodecamp/drums/Heater-1.mp3" id="Q"></audio>Q</div>
            <div className="drum-pad" id="W"><audio className="clip" src="https://s3.amazonaws.com/freecodecamp/drums/Heater-2.mp3" id="W"></audio>W</div>
            <div className="drum-pad" id="E"><audio className="clip" src="https://s3.amazonaws.com/freecodecamp/drums/Heater-3.mp3" id="E"></audio>E</div>
            <div className="drum-pad" id="A"><audio className="clip" src="https://s3.amazonaws.com/freecodecamp/drums/Heater-4_1.mp3" id="A"></audio>A</div>
            <div className="drum-pad" id="S"><audio className="clip" src="https://s3.amazonaws.com/freecodecamp/drums/Heater-6.mp3" id="S"></audio>S</div>
            <div className="drum-pad" id="D"><audio className="clip" src="https://s3.amazonaws.com/freecodecamp/drums/Dsc_Oh.mp3" id="D"></audio>D</div>
            <div className="drum-pad" id="Z"><audio className="clip" src="https://s3.amazonaws.com/freecodecamp/drums/Kick_n_Hat.mp3" id="Z"></audio>Z</div>
            <div className="drum-pad" id="X"><audio className="clip" src="https://s3.amazonaws.com/freecodecamp/drums/RP4_KICK_1.mp3" id="X"></audio>X</div>
            <div className="drum-pad" id="C"><audio className="clip" src="https://s3.amazonaws.com/freecodecamp/drums/Cev_H2.mp3" id="C"></audio>C</div>  
         </div>
          </div>
  
      )
    }
  }
  
  ReactDOM.render(<App />, document.getElementById("root"))