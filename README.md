# R_D
Interview Releted Question and R&amp;D

# Git Commands Types <br />
### GIT CHEAT SHEET
1. CONFIGURE TOOLING - Configure user information for all local repositories <br />
```js
$ git config --global user.name "[name]" =>Sets the name you want atached to your commit transactions
$ git config --global user.email "[email address]" =>Sets the email you want atached to your commit transactions
$ git config --global color.ui auto =>Enables helpful colorization of command line output
```
2. CREATE REPOSITORIES - Start a new repository or obtain one from an existing URL <br />
```js
$ git init [project-name] =>Creates a new local repository with the specified name
$ git clone [url] =>Downloads a project and its entire version history
```
3. MAKE CHANGES - Review edits and craf a commit transaction <br />
```js
$ git status => Lists all new or modified files to be commited
$ git add [file] =>Snapshots the file in preparation for versioning
$ git reset [file] =>Unstages the file, but preserve its contents
$ git diff =>Shows file differences not yet staged
$ git diff --staged =>Shows file differences between staging and the last file version
$ git commit -m "[descriptive message]" =>Records file snapshots permanently in version history
```
4. GROUP CHANGES - Name a series of commits and combine completed efforts <br />
```js
$ git branch =>Lists all local branches in the current repository
$ git branch [branch-name] =>Creates a new branch
$ git checkout [branch-name] =>Switches to the specified branch and updates the working directory
$ git merge [branch] =>Combines the specified branch’s history into the current branch
$ git branch -d [branch-name] =>Deletes the specified branch
```
5. REFACTOR FILENAMES - Relocate and remove versioned files <br />
```js
$ git rm [file]  => Deletes the file from the working directory and stages the deletion
$ git rm --cached [file] =>Removes the file from version control but preserves the file locally
$ git mv [file-original] [file-renamed] =>Changes the file name and prepares it for commit
```
6. SUPPRESS TRACKING - Exclude temporary files and paths <br />
```js
*.log
build/
temp-*
=>a text file named .gitignore suppresses accidental versioning of files and paths matching the specified paterns
$ git ls-files --other --ignored --exclude-standard
=> Lists all ignored files in this project
```
7. SAVE FRAGMENTS - Shelve and restore incomplete changes <br />
```js
$ git stash => Temporarily stores all modified tracked files
$ git stash list =>Lists all stashed changesets
$ git stash pop => Restores the most recently stashed files
$ git stash drop =>Discards the most recently stashed changeset
```
8. REVIEW HISTORY - Browse and inspect the evolution of project files <br />
```js
$ git log =>Lists version history for the current branch
$ git log --follow [file] =>Lists version history for a file, including renames
$ git diff [first-branch]...[second-branch] =>Shows content differences between two branches
$ git show [commit] => Outputs metadata and content changes of the specified commit
```
9. REDO COMMITS - Erase mistakes and craf replacement history <br />
```js
$ git reset [commit]
Undoes all commits afer [commit], preserving changes locally
$ git reset --hard [commit]
Discards all history and changes back to the specified commit
```
10. SYNCHRONIZE CHANGES - Register a repository bookmark and exchange version history <br />
```js
$ git fetch [bookmark] => Downloads all history from the repository bookmark
$ git merge [bookmark]/[branch] =>Combines bookmark’s branch into current local branch
$ git push [alias] [branch] =>Uploads all local branch commits to GitHub
$ git pull =>Downloads bookmark history and incorporates changes
```
# Steps to be performed to achieve git repository
$ right click of so urce folder<br />
$ git init <br />
$ git config --global user.name 'sushil kumar bhaskar' <br />
$ git config --global user.email 'xorasysgen@yahoo.com' <br />
$ git status<br />
$ git add . # will add all<br />
$ git add *.html # will add only html<br />
$ git add file.html # will add only file.html<br />
$ git commit<br />
$ press i<br />
$ add comment like --initial commit<br />
$ press escape then type :wq  #save and exit<br />
$ do any changes get status and add that<br />
$ git commit -m 'changes in renamed_test.txt'<br />
$ git branch login #create branch<br />
$ git commit -m 'new branch created'<br />
$ git checkout login<br />
$ touch login.html<br />
$ git add .<br />
$ git commit -m 'login.html added'<br />
$ git checkout msater # login.html will gone<br />
$ git merge login # edit window will open add comment and save and exit<br />
$ git remote<br />
$ git remote add origin https://github.com/xorasysgen/node101  # remote server<br />
$ git push -u origin master   # push will update to remote<br />
$ touch readme.md<br />
$ git add .<br />
$ git commit -m 'read me added'<br />
$ git push<br />
$ git pull origin master
From https://github.com/xorasysgen/node101
 * branch            master     -> FETCH_HEAD
Already up to date.


Here are the Git commands which are being covered:<br />
$ git config => command to sets the author name and email address respectively to be used with your commits<br />
```js
Usage: git config –global user.name 'name'   
Usage: git config –global user.email 'email@address' 
```
$ git init =>command is used to start a new repository.<br />
```js
Usage: git init
```
$ git clone => command is used to obtain a repository from an existing URL. <br />
```js
Usage: git clone https://github.com/xorasysgen/node101
```
$ git add => command adds a file to the staging area. <br />
```js
Usage: git add abc.js or .
```
$ git commit => command records or snapshots the file permanently in the version history.<br />
```js
Usage: git commit -m 'Type in the commit message' 
```
$ git diff =>command shows the file differences which are not yet staged.<br />
```js
Usage: git diff   #shows the file differences which are not yet staged.
Usage: git diff –staged    #differences between the files in the staging area and the latest version present.
Usage: git diff [first branch] [second branch]  #differences between the two branches mentioned.
```
$ git reset [filename]=> command unstages the file, but it preserves the file contents. <br />
```js
Usage: git reset [file] #unstages the file, but it preserves the file contents.
Usage: git reset hashOfCommit #undoes all the commits after the specified commit and preserves the changes locally.
Usage: git reset –hard hashOfCommit  #discards all history and goes back to the specified commit.
```
$ git status => lists all the files that have to be committed.<br />
```js
Usage: git status  
```
$ git rm => deletes the file from your working directory and stages the deletion.<br />
```js
Usage: git rm filename
```
$ git log => used to list the version history for the current branch.<br />
```js
Usage: git log  
Usage: git log –follow[file] 
```
$ git show => shows the metadata and content changes of the specified commit.<br />
```js
Usage: git show hashOfCommit
```
$ git tag => is used to give tags to the specified commit.<br />
```js
Usage: git tag hashOfCommit  
```
$ git branch =>lists all the local branches in the current repository.<br />
```js
Usage: git branch
Usage: git branch branch_name  #command creates a new branch.
Usage: git branch -d branch_name #deletes the feature branch.
```
$ git checkout<br />
```js
Usage: git checkout branch_name  #is used to switch from one branch to another.
Usage: git checkout -b branch_name #creates a new branch and also switches to it.
```
$ git merge<br />
```js
Usage: git merge branch_name]  #merges the specified branch’s history into the current branch.
```
$ git remote<br />
```js
Usage: git remote add origin Remote_Server_Link
```
$ git push => sends the committed changes of master branch to your remote repository.<br />
```js
Usage: git push origin master 
Usage: git push [variable name] [branch] 
Usage: git push –all [variable name] #pushes all branches to your remote repository.
Usage: git push [variable name] :[branch name]  #deletes a branch on your remote repository.
```
$ git pull =>fetches and merges changes on the remote server to your working directory.<br />
```js
Usage: git pull origin master 
```
$ git stash => temporarily stores all the modified tracked files.<br />
```js
Usage: git stash save   #temporarily stores all the modified tracked files.
Usage: git stash pop    #restores the most recently stashed files.
Usage: git stash list   #lists all stashed changesets.
Usage: git stash drop   #discards the most recently stashed changeset
```


# How to ignore particular file
```js
There are two possible options

1 remove application-heroku.properties completely from the git repository and then ignore it completely:
git rm --cached src/main/java/application-heroku.properties and add it to .gitignore.

2 keep src/main/java/application-heroku.properties in the git repository but ignore future changes to this file
git update-index --assume-unchanged  src/main/java/application-heroku.properties

If you wanna start tracking changes again run the following command:
git update-index --no-assume-unchanged src/main/java/application-heroku.properties
```

#References
```html
1. https://dzone.com/articles/top-20-git-commands-with-examples
2. https://www.youtube.com/watch?v=SWYqp7iY_Tc
3. https://www.freecodecamp.org/news/javascript-essentials-why-you-should-know-how-the-engine-works-c2cc0d321553/
4. https://github.github.com/training-kit/downloads/github-git-cheat-sheet.pdf
```

