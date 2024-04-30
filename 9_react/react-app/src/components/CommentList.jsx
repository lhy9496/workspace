import React from 'react'
import Comment from './Comment'

const comments = [
    {
        name : "뜌따",
        comment : "뜌우따이 뜌따따 우땨야!",
        path: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSr4u_8ODl8cXL6HBqzvUDXPqRtOuvDEuoEyZAL1OntzA&s"
    },{
        name : "A.H.",
        comment : "Nein Nein Nein Nein",
        path: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdVfbFxnRJgXpIoIv9OelNlN-v4IR4uHT6KKmKjboqbQ&s"
    },{
        name : "찌찌뿌예",
        comment : "****** *****",
        path: "https://static.wikia.nocookie.net/my-hero-academia-fanon/images/5/59/JohnProdman_%281%29.png/revision/latest?cb=20190629151606"
    }
]
// =>

const CommnetList = () => {
  return (
    <div>
        {comments.map(comment =>{
            return <Comment name={comment.name} comment={comment.comment} />
        })}
    </div>
  )
}

export default CommnetList