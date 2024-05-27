### Building a sentence using Stacks

**Branch Name:** usingstacksandqueues-prework

**RDE workfows:**
* `rde wflow run stacksandqueues-prework-stacks-sentencebuilderapp`
* `rde wflow run stacksandqueues-prework-stacks-sentencebuildertest`


Expected time required: 15 min

The included code represents a Sentence Builder app that constructs a sentence using `String`s 
that are added to it. Additionally, it has the functionality to undo the added words, removing
them from the sentence. Complete the included `SentenceBuilder` class in order to implement 
the functionality required:

* `addWord()` : adds a `String` to the end of the sentence.
* `undo()` : returns the `String` that was most recently added to the sentence and remove it 
    from the sentence. If there aren't any words in the sentence, it should return `null`.
* `getSentenceWords()` : returns the current contents of the `sentence`. The format should be 
    a `String` with each word separated by commas with square brackets around the entire `String`.
    Examples: `"[This, is, a, sentence]"` or `"[]"` or `"[This]"`

Run the `SentenceBuilderApp`'s `main()` method to test your implementation.

HINTS:
* [Which data structure should I use?](hints/hint-01.md)
* [Are there any error conditions I've missed?](hints/hint-02.md)
* [How should I return the sentence words?](hints/hint-03.md)
