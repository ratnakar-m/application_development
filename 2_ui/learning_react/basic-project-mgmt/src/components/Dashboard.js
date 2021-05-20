import React from 'react';
import AddProject from './AddProject';
import ProjectsList from './ProjectsList';
import './Dashboard.css'

function Dashboard(props){
    return <div className="dashboard">
        <AddProject/>
        <ProjectsList/>
    </div>
        
}
export default Dashboard;