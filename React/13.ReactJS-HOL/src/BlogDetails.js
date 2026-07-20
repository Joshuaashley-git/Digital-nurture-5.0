import React from 'react';
import { blogs } from './data';

function BlogDetails(props){
    const hasBlogs=props.blogs && props.blogs.length>0;

    return(
        <div>
            {hasBlogs &&(
                <ul>
                    {props.blogs.map((blog)=>(
                        <div key={blog.id}>
                            <h3>{blog.title}</h3>
                            <h4>By {blog.author}</h4>
                        </div>
                    ))}
                </ul>
            )}

            {!hasBlogs ? <p>No blog posts yet.</p>: null}
        </div>
    );
}

export default BlogDetails;