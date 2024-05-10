import React, {Component} from "react";
const styles = {
    wrapper:{
        
    },
    commentText: {

    },
}

class Comment extends Component{
    constructor(props) {
        super(props)

        //class Component에서는 state라는 json 형식의 map을 통해
        //필드를 만들어줄 수 있다.

        this.state = {};

        componentDidMount(){
            console.log(`${this.props.id}의 componentDidMount`)
        }

        componentDidUpdate(){
            console.log(`${this.props.id}의 componentDidUpdate`)
        }

        componentWillUnmount(){
            console.log(`${this.props.id}의 componentWillUnmount`)
        }

        render() {
            return(
                <div style={styles.wrapper}>
                    <span style={styles.commentText}>
                        {this.props.message}
                    </span>
                </div>
            )
        }
    }
}

export default Comment