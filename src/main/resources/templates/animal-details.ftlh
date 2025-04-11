<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Animal Gallery</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>

<body class="bg-gray-100 pt-16">

    <!-- Navigation Bar -->
    <nav class="bg-pink-500 text-white p-4 shadow-lg fixed w-full top-0 z-10">
        <div class="container mx-auto flex justify-between items-center">
            <h1 class="text-xl font-bold">Animal Gallery</h1>
            <div>
                <a href="/animals/all" class="bg-white text-pink-500 px-4 py-2 rounded-lg shadow hover:bg-gray-200">Homepage</a>
                <a href="/animals/createForm" class="bg-white text-pink-500 px-4 py-2 rounded-lg shadow hover:bg-gray-200 ml-4">Create New Animal</a>
            </div>
        </div>
    </nav>

  <div class="container" style="margin-top: 15px;">
      <h1>${title}</h1>
      <div class="card">
          <h5 class="card-header">${animal.name}</h5>

          <div class="card-body">

              <h5 class="card-title">ID: ${animal.animalID?c}</h5>
              <p class="card-text">Name: ${animal.name}</p>
              <p class="card-text">Origin: ${animal.origin}</p>
              <p class="card-text">Lifepsan: ${animal.lifespan}</p>
              <p class="card-text">Description: ${animal.description}</p>

              <a href="/animals/all" class="bg-white text-pink-500 px-4 py-2 rounded-lg shadow hover:bg-gray-200">
              Go back
              <a href="/animals/update/${animalID?c}" class="bg-white text-pink-500 px-4 py-2 rounded-lg shadow hover:bg-gray-200">
              Edit
              <a href="/animals/delete/${animalID?c}" class="bg-white text-pink-500 px-4 py-2 rounded-lg shadow hover:bg-gray-200">
              Delete

              </a>
          </div>
      </div>

  </div>
  </body>