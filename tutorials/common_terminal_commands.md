
## File System Navigation

| Command                             | Description                                                                       |
| ----------------------------------- | --------------------------------------------------------------------------------- |
| ls                                  | List directory contents                                                           |
| cd                                  | Change directory to home                                                          |
| cd [dirname]                        | Change directory to specific directory                                            |
| cd ..                               | Change to parent directory                                                        |

## Working with files and directories

| Command                     | Description                                         |
| --------------------------- | --------------------------------------------------- |
| mkdir [dirname]             | Make directory                                      |
| touch [filename]            | Create file                                         |
| rm [filename]               | Remove file                                         |
| rm -r [dirname]             | Remove directory                                    |
| cp [filename] [dirname]     | Copy file                                           |
| mv [filename] [dirname]     | Move file                                           |
| mv [dirname] [dirname]      | Move directory                                      |
| mv [filename] [filename]    | Rename file or folder                               |
| mv [filename] [filename] -v | Rename Verbose - print source/destination directory |

## nano - Terminal editor

`nano` command is a termnial text editor. It creates or open an existing file to edit:

```
  nano [filename]
```

Exit the terminal editor:  `Ctrl + X` and then `Y` to save and `N` to not save your changes


## vim - Terminal editor

`vim` command is another termnial text editor. It creates or open an existing file to edit:

```
  vim [filename]
```

Type `i` to edit the file.

Exit and save the file: `Esc :x`
Exit without saving the file: `Esc :q`

Exit the terminal editor:  `Ctrl + X` and then `Y` to save and `N` to not save your changes
