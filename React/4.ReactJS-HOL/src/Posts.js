import React,{Components} from 'react';
import Post from './Post';

class Posts extends Components{
    constructor(props){
        super(props);
        this.state={
            posts:[],hasError:false
        }
    }
        loadPosts=()=>{
            fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response=>response.json())
            .then(data=>{
                this.setState({posts: data});
            })
            .catch(error=>{
                console.error('Error fetching posts:', error);
            })
        }

        componentDidMount(){
            this.loadPosts();
        }

        componentDidCatch(error, info){
            this.setState({hasError:true});
            alert('Something went wrong while rendering the posts: '+error.toString());
        }
    render(){
        if(this.state.hasError){
            return <h2>Something went wrong.</h2>;
        }
        return(
            <div>
                <h1>Blog Posts</h1>
                {
                    this.state.posts.map(post=>(
                        <Post key={post.id} title={post.title} body={post.body}/>
                    ))
                }
            </div>
        )
    }


}
export default Posts;