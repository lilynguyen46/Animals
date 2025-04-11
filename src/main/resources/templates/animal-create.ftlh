<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Animal List</title>


    <script src="https://cdn.tailwindcss.com"></script>

    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>

<body class="bg-gray-100 pt-16"> <!-- Added padding-top -->

<!-- Navigation Bar -->
<nav class="bg-pink-500 text-white p-4 shadow-lg">
    <div class="container mx-auto flex justify-between items-center">
        <h1 class="text-xl font-bold">Animal Gallery</h1>
        <div>
            <a href="/animals/all" class="bg-white text-pink-500 px-4 py-2 rounded-lg shadow hover:bg-gray-200">Homepage</a>
            <a href="/animals/createForm" class="bg-white text-pink-500 px-4 py-2 rounded-lg shadow hover:bg-gray-200 ml-4">Create New Animal</a>        </div>
    </div>
</nav>

<div class="container mx-auto mt-4">
    <h1 class="text-2xl font-semibold mb-4">${title}</h1>
    <form id="new-animal" action="/animals/new" method="post" class="space-y-4">
        <input type="text" id="name" name="name" placeholder="Name" class="block w-full p-2 border border-gray-300 rounded"/>
        <input type="text" id="origin" name="origin" placeholder="Origin" class="block w-full p-2 border border-gray-300 rounded"/>
        <input type="number" id="lifespan" name="lifespan" step="0.01" placeholder="Lifespan" class="block w-full p-2 border border-gray-300 rounded"/>
        <input type="text" id="description" name="description" placeholder="Description" class="block w-full p-2 border border-gray-300 rounded"/>
        <div class="flex gap-4">
            <button type="submit" class="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">Save</button>
            <a href="/animals/all" class="border border-red-500 text-red-500 px-4 py-2 rounded hover:bg-red-100">Cancel</a>
        </div>
    </form>
</div>

</body>
</html>
