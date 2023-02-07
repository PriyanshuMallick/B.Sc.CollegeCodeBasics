import { projectFiles } from "./projectFileList.js";
const indexTable = document.getElementById("indexTable");
if (indexTable != null) {
    addIndexTable(indexTable, projectFiles);
}
function addIndexTable(table, files) {
    files.forEach((file) => {
        const gridRow = document.createElement("div");
        gridRow.innerHTML = `
      <div class="grid-row">
        <div class="grid-cell text-left">${file.name}</div>
        <div class="grid-cell text-left">${file.description}</div>
        <div class="grid-cell">
          <a href="${file.link}" target="_blank">
            <div class="btn">
              View Project
            </div>
          </a>
        </div>
      </div>
    `;
        table.appendChild(gridRow);
    });
}
//# sourceMappingURL=index.js.map