

function tuttiPosts()
{
  fetch('https://jsonplaceholder.typicode.com/posts')
    .then(response => response.json())
    .then(json =>
    {
      console.log(json);
      displayPosts(json);
    })
}

function displayPosts(posts)
{
  const post = posts.map(post =>
  {
    return `
        <div class="col-md-4 mb-4">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">${post.title}</h5>
              <p class="card-text">Post: ${post.body}</p>
              <p class="card-text">Numero: ${post.id}</p>
            </div>
          </div>
        </div>
      `;
  }).join('');

  document.getElementById("divPrincipale").innerHTML = `<div class="row">${post}</div>`;
}

function post3()
{
  fetch('https://jsonplaceholder.typicode.com/posts/3')
    .then(response => response.json())
    .then(json =>
    {
      postId3(json);
    })
}
function postId3(post)
{
  return document.getElementById("divPrincipale").innerHTML = `
        <div class="col-md-4 mb-4">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">${post.title}</h5>
              <p class="card-text">Post: ${post.body}</p>
              <p class="card-text">Numero: ${post.id}</p>
            </div>
          </div>
        </div>
      `;
}

function commentiPost3()
{
  fetch('https://jsonplaceholder.typicode.com/comments?postId=1')
    .then(response => response.json())
    .then(json =>
    {
      displayCommenti(json);
    })
}

function displayCommenti(commenti)
{
  const commento = commenti.map(commento =>
  {
    return `
        <div class="col-md-4 mb-4">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">${commento.name}</h5>
              <p class="card-text">Post: ${commento.body}</p>
              <p class="card-text">Numero: ${commento.id}</p>
            </div>
          </div>
        </div>
      `;
  }).join('');

  document.getElementById("divPrincipale").innerHTML = `<div class="row">${commento}</div>`;
}









