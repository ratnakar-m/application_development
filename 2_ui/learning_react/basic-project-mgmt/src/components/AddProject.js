import "./AddProject.css";

const AddProject = () => {
  const addProjectHandler = (event) => {
    event.preventDefault();
  };

  return (
    <div className="card">
      <form class="input">
        <label htmlFor="project_title">Project Title</label>
        <input id="project_title" type="text" />
        <label htmlFor="project_code">Project Code</label>
        <input id="project_code" type="text" />
        <label htmlFor="start_date">Start Date</label>
        <input id="start_date" type="date" />
        <label htmlFor="end_date">Expected End Date</label>
        <input id="end_date" type="date" />
        <button type="submit" onClick={addProjectHandler} className="button">
          Add Project
        </button>
      </form>
    </div>
  );
};

export default AddProject;
