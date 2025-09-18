# shinytoys

This will be a place we can build, contribute, and share any custom data structures, algorithms, or utility classes written in Java. I thought it would be neat to have a library we could use in future projects or competitions. In addition, this repository will serve as a learning tool as we practice contributing to a GitHub repository.

#### If you don't have git on your machine, [install it](https://docs.github.com/en/get-started/quickstart/set-up-git).

---

## change this below here

## Fork this repository

<img align="left" width="800" src="https://firstcontributions.github.io/assets/Readme/fork.png" alt="fork this repository" />

Fork this repository by clicking on the fork button on the top of this page.
This will create a copy of this repository in your account.

## Clone the repository

<img align="left" width="800" src="https://firstcontributions.github.io/assets/Readme/clone.png" alt="clone this repository" />

Now clone the forked repository to your machine. Go to your GitHub account, open the forked repository, click on the code button, then on SSH tab and then click the _copy to clipboard_ icon.

Open a terminal and run the following git command:

```bash
git clone "url you just copied"
```

where "url you just copied" (without the quotation marks) is the url to this repository (your fork of this project). See the previous steps to obtain the url.

<img align="right" width="300" src="https://firstcontributions.github.io/assets/Readme/copy-to-clipboard.png" alt="copy URL to clipboard" />

For example:

```bash
git clone git@github.com:this-is-you/shinytoys.git
```

where `this-is-you` is your GitHub username. Here you're copying the contents of the shinytoys repository on GitHub to your computer.

## Create a branch

Change to the repository directory on your computer (if you are not already there):

```bash
cd shinytoys
```

> Note: You will see another direcotry called shinytoys, this is where you will put your code.

Now create a branch using the `git switch` command:

```bash
git switch -c your-new-branch-name
```

For example:

```bash
git switch -c new-shiny-toy
```

<details>
<summary> <strong>If you get any errors using git switch, click here:</strong> </summary>

If the error message "Git: `switch` is not a git command. See `git –help`" appears, it's likely because you're using an older version of git.

In this case, try to use `git checkout` instead:

```bash
git checkout -b your-new-branch-name
```

</details>

#### In the future, you might want to ensure your fork is up-to-date, especially if you're making changes to code others are working on. I'll explain how to do this later on.

## Start writing and commit those changes

Start happily coding. When your ready you can execute the command `git status` and you'll see there are changes.

Add those changes to the branch you just created using the `git add` command:

```bash
git add -A
```

I like to use `-A` flag because it will add all changes in existing files, add any new files, and remove any deleted files. Basically, all changes (hints -A or --all).

> As a side note, I found this [cool website](https://explainshell.com/) that provides the help text for a command-line, you can enter git commands and get help fast.

Alternatively, you could add just the file your working on:

```bash
git add my-file
```

Now commit those changes using the `git commit` command:

```bash
git commit -m "Started making a new shiny toy"
```

## Push changes to GitHub

Push your changes using the command `git push`:

```bash
git push -u origin your-branch-name
```

replacing `your-branch-name` with the name of the branch you created earlier.

<details>
<summary> <strong>If you get any errors while pushing, click here:</strong> </summary>

-   ### Authentication Error

         <pre>remote: Support for password authentication was removed on August 13, 2021. Please use a personal access token instead.

    remote: Please see https://github.blog/2020-12-15-token-authentication-requirements-for-git-operations/ for more information.
    fatal: Authentication failed for 'https://github.com/<your-username>/first-contributions.git/'</pre>
    Go to [GitHub's tutorial](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account) on generating and configuring an SSH key to your account.

    Also, you might want to run 'git remote -v' to check your remote address.

    If it looks anything like this:
      <pre>origin	https://github.com/your-username/your_repo.git (fetch)
      origin	https://github.com/your-username/your_repo.git (push)</pre>

    change it using this command:

    ```bash
    git remote set-url origin git@github.com:your-username/your_repo.git
    ```

    Otherwise you'll still get prompted for username and password and get authentication error.
    </details>

## Submit your changes for review

If you go to your repository on GitHub, you'll see a `Compare & pull request` button. Click on that button.

<img style="float: right;" src="https://firstcontributions.github.io/assets/Readme/compare-and-pull.png" alt="create a pull request" />

Now submit the pull request.

<img style="float: right;" src="https://firstcontributions.github.io/assets/Readme/submit-pull-request.png" alt="submit pull request" />

I'll be merging all your changes into the main branch of this project.

# Keeping your fork synced with this repository

First, the flow for a full sync should be understood, which is important. In this schema, there are 3 different repos: my public repo on Github `github.com/dustij/shinytoys.git`, your fork of the repo on GitHub `github.com/Your-Name/shinytoys/` and your local machine's repo from which you are suppose to work. This kind of cooperation is typical for open source projects and called `Triangle Workflows`.

To keep your two repos up-to-date with my public repo, we first have to fetch and merge the public repo with your local machine's repo.

Our second move will be to push your local repo to your GitHub fork. As you've seen earlier, it's only from your fork that you can ask for a "pull request". So your GitHub fork is the last repo to be updated.

Now, let's see how to do it:

First, you must be on your main branch. To know which branch you are on, check the first line of:

```
git status
```

if you are not already on main:

```
git checkout main
```

### One-Time Setup: Add Upstream Remote

Add my public repo to your git with `add upstream remote-url`:

```
git remote add upstream https://github.com/dustij/shinytoys.git
```

This is a way of telling git that another version of this project exists in the specified url and we're calling it `upstream`.

### Going forward...

If you want to fetch **AND** merge the latest changes of my fork (`upstream` remote) to your local branch at same time then you do a pull (different from pull request):

```
git pull upstream main
```

### Almost done.

Lastly, if you push your main branch to your fork, your GitHub fork will also have the changes:

```
git push origin main
```

Notice here you're pushing to the remote named `origin` (your forked repository on GitHub).

So by now or at this point, all your repositories are up-to-date. Well done! You should do this, every time your GitHub repo tells you that you are a few commits behind.

## Resources

I used [this](https://github.com/firstcontributions/first-contributions) as reference when writing this. Also, they include many helpful links.

!!!!!THIS SHOULD BE A CONFLICT (but only just a little bit)
