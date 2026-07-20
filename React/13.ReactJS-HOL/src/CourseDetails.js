import React from 'react';

function renderStatus(status){

    switch(status){
        case 'available':
            return<span Style={{color:'green'}}>Available</span>;
        case 'coming-soon':
            return<span style={{color:'orange'}}>Coming Soon</span>;
        case 'sold-out':
            return<span style={{color:'red'}}>Sold Out</span>
        default:
            return<span>Unknown</span>
    }
}

function CourseDetails(props){
    return(
        <ul>
            {props.courses.map((course)=>(
                <div key={course.id}>
                    <h3>{course.cname}</h3>
                    <h4>{course.duration}</h4>
                    {(()=>{
                        return renderStatus(course.status);
                    })}
                </div>
            ))}
        </ul>
    );
}

export default CourseDetails;