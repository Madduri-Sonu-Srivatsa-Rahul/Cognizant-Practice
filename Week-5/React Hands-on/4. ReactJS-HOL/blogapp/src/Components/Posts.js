import React,{Component} from "react";
import Post from "../Post";

class Posts extends Component{
    constructor(props){
        super(props);
        this.state = {
            posts: [],
        };
    }
    loadPosts(){
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then((res) => res.json())
            .then((data) => {
                this.setState({ posts: data });
            })
            .catch((error) => {
                throw error;
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert(error.message);
    }

    render() {
        return (
            <div>
                <h1>Posts</h1>
                {this.state.posts.map(post => (
                    <div key={post.id}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;
