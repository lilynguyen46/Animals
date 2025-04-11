<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Homepage</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 pt-16">

<!-- Navigation Bar -->
<nav class="bg-pink-500 text-white p-4 shadow-lg">
    <div class="container mx-auto flex justify-between items-center">
        <h1 class="text-xl font-bold">Animal Gallery</h1>
        <div>
            <a href="/animals/all" class="bg-white text-pink-500 px-4 py-2 rounded-lg shadow hover:bg-gray-200">Homepage</a>
            <a href="/animals/createForm" class="bg-white text-pink-500 px-4 py-2 rounded-lg shadow hover:bg-gray-200 ml-4">Create New Animal</a>
        </div>
    </div>
</nav>

<!-- Main Content -->
<div class="container mx-auto p-6">
    <h1 class="text-3xl font-bold text-center mb-8">Welcome to my Animal Gallery!</h1>

    <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
        <#list animalList as animal>
        <div class="bg-white shadow-lg rounded-lg p-4 flex flex-col h-full">
            <img src="Animals/elephant.jpg" alt="Image of ${animal.name}" class="w-full h-48 object-cover rounded">

            <div class="flex flex-col flex-grow mt-4">
                <h5 class="text-xl font-bold mb-2">${animal.name}</h5>
                <p class="mb-1">Animal ID: ${animal.animalID}</p>
                <p class="mb-1">Origin: ${animal.origin}</p>
                <p class="mb-1">Lifespan: ${animal.lifespan}</p>
                <p class="mb-4">Description: ${animal.description}</p>
                <a href="/animals/${animal.animalID?c}" class="bg-white text-pink-500 px-4 py-2 rounded-lg shadow hover:bg-gray-200">
                    More Details
                </a>


            </div>
        </div>
        </#list>
    </div>
</div>

</body>
</html>
