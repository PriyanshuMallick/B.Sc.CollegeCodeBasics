// const indexTable = document.getElementById("indexTable") as HTMLTableElement;
// const projectFiles = [
//   {
//     name: "Homepage",
//     description: "The main page of the project",
//     link: "homepage.html",
//   },
//   {
//     name: "About Us",
//     description: "Information about the project and its team",
//     link: "about.html",
//   },
//   {
//     name: "Contact Us",
//     description: "Information on how to contact the team",
//     link: "contact.html",
//   },
// ];
// for (const file of projectFiles) {
//   const row = indexTable.insertRow();
//   const nameCell = row.insertCell();
//   const descriptionCell = row.insertCell();
//   const linkCell = row.insertCell();
//   nameCell.innerHTML = file.name;
//   descriptionCell.innerHTML = file.description;
//   linkCell.innerHTML = `<a href="${file.link}">View</a>`;
// }
const projectFiles = [
    { name: "Project 1", url: "project1.html" },
    { name: "Project 2", url: "project2.html" },
    { name: "Project 3", url: "project3.html" },
    // Add more links as needed...
];
const grid = document.querySelector(".grid");
for (const file of projectFiles) {
    const gridItem = document.createElement("div");
    gridItem.classList.add("grid-item");
    gridItem.innerHTML = `
    <h2>${file.name}</h2>
    <a href="${file.url}" target="_blank">View Project</a>
  `;
    grid.appendChild(gridItem);
}
//# sourceMappingURL=index.js.map