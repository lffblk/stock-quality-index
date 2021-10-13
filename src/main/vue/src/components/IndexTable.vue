<template>
  <div class="index_table_container">
    <table>
      <thead>
      <tr>
        <th>Parameter</th>
        <th>Value</th>
        <th>Score</th>
        <th>Comment</th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <td>Market capitalization</td>
        <td>Cell 2</td>
        <td>Cell 3</td>
        <td>Cell 4</td>
      </tr>
      <tr>
        <td>Earnings per share (EPS)</td>
        <td>Cell 2</td>
        <td>Cell 3</td>
        <td>Cell 4</td>
      </tr>
      <tr>
        <td>Return on equity (ROE)</td>
        <td>Cell 2</td>
        <td>Cell 3</td>
        <td>Cell 4</td>
      </tr>
      <tr>
        <td>Debt to equity</td>
        <td>Cell 2</td>
        <td>Cell 3</td>
        <td>Cell 4</td>
      </tr>
      <tr>
        <td>Rates of EPS growth</td>
        <td>Cell 2</td>
        <td>Cell 3</td>
        <td>Cell 4</td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: 'IndexTable',
}
</script>

<style>
.index_table_container table {
  margin-left: auto;
  margin-right: auto;
  margin-top: 2em;
}
table {
  width: 800px;
  border-collapse: collapse;
  overflow: hidden;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
}
th,
td {
  padding: 15px;
  background-color: rgba(255, 255, 255, 0.2);
  color: #fff;
}
thead th {
  background-color: #55608f;
}
tbody tr:hover {
  background-color: rgba(255, 255, 255, 0.3);
}
tbody td {
  position: relative;
}
tbody td:hover:before {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: -9999px;
  bottom: -9999px;
  background-color: rgba(255, 255, 255, 0.2);
  z-index: -1;
}

</style>