import Dashboard from "./components/Dashboard";

function App() {
  const projects = [
    {
      name: "House Construction",
      startDate: new Date(2021, 5, 20),
      estimatedEndDate: new Date(2022, 8, 20),
      status: "TODO"
    },
    {
      name:"Learning java",
      startDate: new Date(2021, 3, 20),
      estimatedEndDate: new Date(2021, 5, 5),
      status: "COMPLETED"
    },
    {
      name:"Learning React",
      startDate: new Date(2021, 5, 15),
      estimatedEndDate: new Date(2021, 6, 5),
      status: "INPROGRESS"
    },
  ];
  return (
    
      <Dashboard projects={projects}/>
    
  );
}

export default App;
