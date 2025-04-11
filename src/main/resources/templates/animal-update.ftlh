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

<div class="container" style="margin-top: 15px;">
    <h1>${title}</h1>
    <form id="new-animal" action="/animals/update/${animal.animalID?c}" method="post">
        <input type="text" id="animalID" name="animalID" value="${animal.animalID?c}" readonly/>
        <input type="text" id="name" name="name" value="${animal.name}" placeholder="Name"/>
        <input type="text" id="origin" name="origin"  value="${animal.origin}" placeholder="Origin"/>
        <input type="number" id="lifespan" name="lifespan" step="0.01" value="${animal.lifespan}" placeholder="Lifespan"/>
        <input type="text" id="description" name="description"  value="${animal.description}" placeholder="Description"/>
        <button type="submit" class="btn btn-primary">Save</button>
       <a href="/animals/${animal.animalID?c}" class="btn btn-outline-danger" >
       Cancel</a>
    </form>

</div>
</body>
</html>
