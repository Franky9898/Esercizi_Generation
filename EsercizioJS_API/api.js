function fetchQuotesPage1()
{
    fetch('https://api.quotable.io/quotes?page=1')
        .then(response => response.json())
        .then(json =>
        {
            console.log(json);
            displayQuotes(json);
        })
}

function displayQuotes(page)
{
    const quote = page.results.map(quote =>
    {
        return `
        <div class="col-md-4 mb-4">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">${quote.author}</h5>
              <p class="card-text">${quote.content}</p>
              <p class="card-text">Tags: ${quote.tags}</p>
            </div>
          </div>
        </div>
      `;
    }).join('');

    document.getElementById("divPrincipale").innerHTML = `<div class="row">${quote}</div>`;
}

function fetchRandom()
{
    let numero = Math.floor(1 + Math.random() * 11);
    fetch('https://api.quotable.io/quotes/random?limit=' + numero)
        .then(response => response.json())
        .then(json => 
        {
            console.log(json);
            displayRandomQuotes(json);
        })
}

function displayRandomQuotes(quotes) 
{
    const quote = quotes.map(quote =>
    {
        return `
        <div class="col-md-4 mb-4">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">${quote.author}</h5>
              <p class="card-text">${quote.content}</p>
              <p class="card-text">Tags: ${quote.tags}</p>
            </div>
          </div>
        </div>
        `;
    }
    ).join('');

    document.getElementById("divPrincipale").innerHTML = `<div class="row">${quote}</div>`;
}


function fetchAuthors()
{
    fetch('https://api.quotable.io/authors')
        .then(response => response.json())
        .then(json => 
        {
            console.log(json)
            displayAuthors(json);
        }
        )
} 

function displayAuthors(page) 
{
    const author = page.results.map(author =>
    {
        return `
        <div class="col-md-4 mb-4">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">${author.name}</h5>
              <p class="card-text">${author.bio}</p>
              <p class="card-text">Numero citazioni: ${author.quoteCount}</p>
            </div>
          </div>
        </div>
        `;
    }
    ).join('');
    document.getElementById("divPrincipale").innerHTML = `<div class="row">${author}</div>`;
}